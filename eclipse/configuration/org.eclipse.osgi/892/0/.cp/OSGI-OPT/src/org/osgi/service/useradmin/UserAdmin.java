/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.service.useradmin;

import org.osgi.framework.InvalidSyntaxException;

/**
 * This interface is used to manage a database of named {@code Role} objects,
 * which can be used for authentication and authorization purposes.
 * 
 * <p>
 * This version of the User Admin service defines two types of {@code Role}
 * objects: "User" and "Group". Each type of role is represented by an
 * {@code int} constant and an interface. The range of positive integers is
 * reserved for new types of roles that may be added in the future. When
 * defining proprietary role types, negative constant values must be used.
 * 
 * <p>
 * Every role has a name and a type.
 * 
 * <p>
 * A {@link User} object can be configured with credentials (e.g., a password)
 * and properties (e.g., a street address, phone number, etc.).
 * <p>
 * A {@link Group} object represents an aggregation of {@link User} and
 * {@link Group} objects. In other words, the members of a {@code Group} object
 * are roles themselves.
 * <p>
 * Every User Admin service manages and maintains its own namespace of
 * {@code Role} objects, in which each {@code Role} object has a unique name.
 * 
 * @noimplement
 * @author $Id: eb978936098e48507b342496a925f760c2282bfa $
 */
public interface UserAdmin {
	/**
	 * Creates a {@code Role} object with the given name and of the given type.
	 * 
	 * <p>
	 * If a {@code Role} object was created, a {@code UserAdminEvent} object of
	 * type {@link UserAdminEvent#ROLE_CREATED} is broadcast to any
	 * {@code UserAdminListener} object.
	 * 
	 * @param name The {@code name} of the {@code Role} object to create.
	 * @param type The type of the {@code Role} object to create. Must be either
	 *        a {@link Role#USER} type or {@link Role#GROUP} type.
	 * 
	 * @return The newly created {@code Role} object, or {@code null} if a role
	 *         with the given name already exists.
	 * 
	 * @throws IllegalArgumentException if {@code type} is invalid.
	 * 
	 * @throws SecurityException If a security manager exists and the caller
	 *         does not have the {@code UserAdminPermission} with name
	 *         {@code admin}.
	 */
	public Role createRole(String name, int type);

	/**
	 * Removes the {@code Role} object with the given name from this User Admin
	 * service and all groups it is a member of.
	 * 
	 * <p>
	 * If the {@code Role} object was removed, a {@code UserAdminEvent} object
	 * of type {@link UserAdminEvent#ROLE_REMOVED} is broadcast to any
	 * {@code UserAdminListener} object.
	 * 
	 * @param name The name of the {@code Role} object to remove.
	 * 
	 * @return {@code true} If a {@code Role} object with the given name is
	 *         present in this User Admin service and could be removed,
	 *         otherwise {@code false}.
	 * 
	 * @throws SecurityException If a security manager exists and the caller
	 *         does not have the {@code UserAdminPermission} with name
	 *         {@code admin}.
	 */
	public boolean removeRole(String name);

	/**
	 * Gets the {@code Role} object with the given {@code name} from this User
	 * Admin service.
	 * 
	 * @param name The name of the {@code Role} object to get.
	 * 
	 * @return The requested {@code Role} object, or {@code null} if this User
	 *         Admin service does not have a {@code Role} object with the given
	 *         {@code name}.
	 */
	public Role getRole(String name);

	/**
	 * Gets the {@code Role} objects managed by this User Admin service that
	 * have properties matching the specified LDAP filter criteria. See
	 * {@code org.osgi.framework.Filter} for a description of the filter syntax.
	 * If a {@code null} filter is specified, all Role objects managed by this
	 * User Admin service are returned.
	 * 
	 * @param filter The filter criteria to match.
	 * 
	 * @return The {@code Role} objects managed by this User Admin service whose
	 *         properties match the specified filter criteria, or all
	 *         {@code Role} objects if a {@code null} filter is specified. If no
	 *         roles match the filter, {@code null} will be returned.
	 * @throws InvalidSyntaxException If the filter is not well formed.
	 * 
	 */
	public Role[] getRoles(String filter) throws InvalidSyntaxException;

	/**
	 * Gets the user with the given property {@code key}-{@code value} pair from
	 * the User Admin service database. This is a convenience method for
	 * retrieving a {@code User} object based on a property for which every
	 * {@code User} object is supposed to have a unique value (within the scope
	 * of this User Admin service), such as for example a X.500 distinguished
	 * name.
	 * 
	 * @param key The property key to look for.
	 * @param value The property value to compare with.
	 * 
	 * @return A matching user, if <em>exactly</em> one is found. If zero or
	 *         more than one matching users are found, {@code null} is returned.
	 */
	public User getUser(String key, String value);

	/**
	 * Creates an {@code Authorization} object that encapsulates the specified
	 * {@code User} object and the {@code Role} objects it possesses. The
	 * {@code null} user is interpreted as the anonymous user. The anonymous
	 * user represents a user that has not been authenticated. An
	 * {@code Authorization} object for an anonymous user will be unnamed, and
	 * will only imply groups that user.anyone implies.
	 * 
	 * @param user The {@code User} object to create an {@code Authorization}
	 *        object for, or {@code null} for the anonymous user.
	 * 
	 * @return the {@code Authorization} object for the specified {@code User}
	 *         object.
	 */
	public Authorization getAuthorization(User user);
}

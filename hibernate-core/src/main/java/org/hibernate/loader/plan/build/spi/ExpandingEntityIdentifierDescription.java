/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.loader.plan.build.spi;

import org.hibernate.loader.plan.spi.EntityIdentifierDescription;

/**
 * Describes an entity identifier description that allows adding fetches; used while
 * building a {@link EntityIdentifierDescription}.

 * @author Steve Ebersole
 */
public interface ExpandingEntityIdentifierDescription extends EntityIdentifierDescription, ExpandingFetchSource {

}

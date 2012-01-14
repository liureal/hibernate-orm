package org.hibernate.spatial;

import org.hibernate.type.descriptor.ValueBinder;
import org.hibernate.type.descriptor.ValueExtractor;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

/**
 * A generic <code>SqlTypeDescriptor</code>, intended to be remapped
 * by the spatial dialect.
 *
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 7/27/11
 */
public class GeometrySqlTypeDescriptor implements SqlTypeDescriptor {

	public static final GeometrySqlTypeDescriptor INSTANCE = new GeometrySqlTypeDescriptor();

	@Override
	public int getSqlType() {
        return 3000; //this value doesn't conflict with presently defined java.sql.Types values.
	}

	@Override
	public boolean canBeRemapped() {
		return true;
	}

	@Override
	public <X> ValueBinder<X> getBinder(JavaTypeDescriptor<X> javaTypeDescriptor) {
		throw new UnsupportedOperationException();
	}

	@Override
	public <X> ValueExtractor<X> getExtractor(JavaTypeDescriptor<X> javaTypeDescriptor) {
		throw new UnsupportedOperationException();
	}
}
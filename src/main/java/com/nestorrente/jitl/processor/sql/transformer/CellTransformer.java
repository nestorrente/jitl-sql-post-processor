package com.nestorrente.jitl.processor.sql.transformer;

import java.sql.ResultSet;

@FunctionalInterface
public interface CellTransformer<T> extends RowTransformer<T> {

	@Override
	default T transformRow(ResultSet resultSet) throws Exception {
		return this.transformCell(resultSet, 1);
	}

	T transformCell(ResultSet resultSet, int columnIndex) throws Exception;

}

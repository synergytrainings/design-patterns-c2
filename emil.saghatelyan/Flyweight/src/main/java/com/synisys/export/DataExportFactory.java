package com.synisys.export;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 * Created by Emil on 12/16/2015.
 */
public class DataExportFactory {

	private static final Table<Color, Font, DataExport> dataExports = HashBasedTable.create();

	public static synchronized DataExport getDataExport(Color color, Font font) {
		if (dataExports.contains(color, font)) {
			return dataExports.get(color, font);
		} else {
			DataExport export = new DataExportImpl(color, font);
			dataExports.put(color, font, export);
			return export;
		}
	}
}


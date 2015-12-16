package com.synisys.export;

import javafx.scene.input.DataFormat;

import java.awt.*;

/**
 * Created by Emil on 12/16/2015.
 */
public class DataExportImpl implements DataExport {
	private Object data;
	private Color backgroundColor;
	private Font font;

	public DataExportImpl(Color backgroundColor, Font font) {
		this.backgroundColor = backgroundColor;
		this.font = font;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}

	@Override
	public void export(Object data) {
		System.out.println(String.format("Export Data"));
	}
}

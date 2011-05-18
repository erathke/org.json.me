package org.json.me.totalcross;

import totalcross.io.ByteArrayStream;
import totalcross.io.DataStream;
import totalcross.io.IOException;

/**
 * TotalCross Writer implementation for JSON.
 * 
 * @author evandro
 */
public class Writer extends DataStream
{

	public Writer()
	{
		super(new ByteArrayStream(512));
	}

	public void write(String s) throws IOException
	{
		writeString(s);
	}

	public void write(char c) throws IOException
	{
		writeChar(c);
	}

	public void write(Writer s) throws IOException
	{
		write(s.readString());
	}
}

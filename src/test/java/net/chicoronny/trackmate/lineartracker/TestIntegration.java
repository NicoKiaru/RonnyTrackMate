package net.chicoronny.trackmate.lineartracker;

import fiji.plugin.trackmate.TrackMatePlugIn_;
import fiji.plugin.trackmate.providers.TrackerProvider;
import ij.ImageJ;

public class TestIntegration
{
	public static void main( final String[] args )
	{
		ImageJ.main( args );

		System.out.println( new TrackerProvider().echo() );

		new TrackMatePlugIn_().run( "samples/FakeTracks.tif" );
	}

}
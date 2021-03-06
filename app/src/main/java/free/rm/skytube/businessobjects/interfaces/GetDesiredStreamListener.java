package free.rm.skytube.businessobjects.interfaces;

import org.schabi.newpipe.extractor.stream.StreamInfo;

import free.rm.skytube.businessobjects.YouTube.VideoStream.StreamMetaData;

/**
 * Interface to be used when retrieving the desired stream (per the user's preferences) from a Video.
 */
public interface GetDesiredStreamListener {

	/**
	 * Called when the video's stream has been successfully retrieved.
	 *
	 * @param streamInfo  The retrieved video's Uri.
	 */
	void onGetDesiredStream(StreamInfo streamInfo);

	/**
	 * Called if an error occurred while retrieving the video's Uri.
	 *
	 * @param errorMessage  Error message.
	 */
	void onGetDesiredStreamError(Exception errorMessage);

}

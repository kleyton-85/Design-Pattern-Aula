package br.com.proxy.pattern;

import java.util.HashMap;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {

	//@Override
	public HashMap<String, Video> popularVideos() {
		connectToServer("https://www.youtube.com");
		return getRandomVideos();
	}
	
	//@Override
	public Video getVideo(String videoId) {
		connectToServer("https://www.youtube.com/" + videoId);
		return getSomeVideo(videoId);
	}

	private int random (int min, int max) {
		return min + (int) (Math.random() *((max - min) + 1));
	}
	private void experienceNetworkLatency() {
		int randomLatency = random(5, 10);
		for (int i = 0; i < randomLatency; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void connectToServer(String server) {
		System.out.print("\n  ### Connecting to " + server + "... ### ");
		experienceNetworkLatency();
		System.out.print("\n  ### Connected! ###" + "\n");
	}
	
	private HashMap <String, Video> getRandomVideos() {
		System.out.print("\n  ### Downloading Populars... ### ");
		experienceNetworkLatency();
		HashMap<String, Video> hmap = new HashMap<String, Video>();
		hmap.put("catzzzzzzzz", new Video("dasdsadasdasda", "Catzzzz.avi"));
		hmap.put("asdasdsadad", new Video("asdfasdasdadas", "Dog play with ball.mp4"));
		hmap.put("dasdsafsdgs", new Video("fghfghfghfghgf", "Dancing video.mpq"));
		hmap.put("kjkhjkhjkhj", new Video("ipopiopiopiopi", "Barcelona vc RealM.mov"));
		hmap.put("hjkuyiyukyk", new Video("qwerqrqewrqrqw", "Programing lesson#1.avi"));
		System.out.print("\n  ### Done! ###" + "\n");
		return hmap;
	}
	
	private Video getSomeVideo(String videoId) {
		System.out.print("\n  ### Downloading Video... ###");
		experienceNetworkLatency();
		Video video = new Video(videoId, "Some Video Title");
		System.out.print("\n  ### Done! ###" + "\n");
		return video;
	}
}

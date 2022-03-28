package br.com.proxy.pattern;

public class Principal {

	public static void main(String[] args) {
		YoutubeDownloader naiveDownloader = 
				new YoutubeDownloader (new ThirdPartyYoutubeClass());
		YoutubeDownloader smartDownloader = 
				new YoutubeDownloader (new YoutubeCacheProxy());
		long naive = test(naiveDownloader);
		long smart = test(smartDownloader);
		System.out.println("Time saved by caching proxy: " + (naive - smart) + "ms");
	}
	
	private static long test(YoutubeDownloader downloader) {
		long startTime = System.currentTimeMillis();
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancevideoo");
		downloader.renderVideoPage("catzzzzzzzz");
		downloader.renderVideoPage("someothervid");
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");
		return estimatedTime;
	}

}

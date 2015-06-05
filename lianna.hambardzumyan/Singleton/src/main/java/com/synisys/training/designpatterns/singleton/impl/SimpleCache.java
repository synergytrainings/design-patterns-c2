package com.synisys.training.designpatterns.singleton.impl;

import java.awt.Image;
import java.util.Map;
import java.util.WeakHashMap;

import javax.imageio.ImageIO;

public enum SimpleCache {
	INSTANCE;

	private Map<String, Image> cache = new WeakHashMap<>();

	/**
	 * This code is used to load the images used by class. If an image has
	 * already been accessed it may be cached, so look in the cache first. If
	 * it's not in the cache, load it from the disk.
	 */
	public Image getImage(String imageName) {
		Image cachedItem = cache.get(imageName);
		if (cachedItem == null) {
			final Image imageIcon;
			try {
				imageIcon = ImageIO.read(SimpleCache.class.getClassLoader().getResource(imageName));
				cache.put(imageName, imageIcon);
				return imageIcon;
			} catch (Exception e) {
				throw new RuntimeException("Cannot find image. It must be on the classpath.", e);
			}
		}
		return cachedItem;
	}

}

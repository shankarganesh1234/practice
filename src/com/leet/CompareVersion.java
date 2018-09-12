package com.leet;

import java.util.LinkedList;
import java.util.List;

public class CompareVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int compareVersion(String version1, String version2) {

		if(version1 == null || version2 == null)
			return -1;
		
		Version v1 = new Version(version1);
		Version v2 = new Version(version2);
		return v1.compareTo(v2);
	}

	static class Version {
		String version;
		List<Integer> versionNumbers;

		public Version(String version) {
			this.version = version;
			this.versionNumbers = new LinkedList<>();
			String[] versions = version.split("\\.");

			for (String s : versions) {
				this.versionNumbers.add(Integer.valueOf(s));
			}
		}

		public int compareTo(Version v2) {

			int sizeOne = this.versionNumbers.size();
			int sizeTwo = v2.versionNumbers.size();
			
			int len = Math.max(sizeOne, sizeTwo);
			int i = 0;
			while (i < len) {

				int version1 = i < sizeOne ? this.versionNumbers.get(i) : 0;
				int version2 = i < sizeTwo ? v2.versionNumbers.get(i) : 0;

				if (version2 > version1)
					return -1;
				else if(version1 > version2)
					return 1;
				
				i++;
			}
			return 0;
		}
	}
}

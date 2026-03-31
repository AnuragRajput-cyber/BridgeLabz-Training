package m1.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Version{
	String versionName;
	int fileSize;
	Version(String versionName,int fileSize){
		this.versionName=versionName;
		this.fileSize=fileSize;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public int getFileSize() {
		return fileSize;
	}
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	@Override
	public String toString() {
		return getVersionName()+" "+getFileSize();
	}
	
}
public class VersionControlledStorage {
	public static HashMap<String ,List<Version>>storage=new HashMap<>();
	public static void upload(String fileName,Version v) {
		storage.putIfAbsent(fileName, new ArrayList<>());
		try {
			List<Version>list=storage.get(fileName);
			boolean existing=list.stream().anyMatch(ver->ver.getVersionName().equalsIgnoreCase(v.getVersionName()));
			if(existing) {
				System.out.println("Already Present");
				return;
			}
			list.add(v);
			System.out.println("Successfully added:filename: "+fileName+" with version:"+v.getVersionName()+" size: "+v.getFileSize());
		}catch(Exception e) {
			System.out.println("error during upload!");
		}
		
	}
	public static void fetch(String fileName) {
		if(!storage.containsKey(fileName)) {
			System.out.println("File Not found");
			return;
		}
		storage.get(fileName).stream().sorted(Comparator.comparing(Version::getFileSize).thenComparing(Comparator.comparing(Version::getVersionName))).forEach(v -> System.out.println(
	               fileName + " " + v.getVersionName() + " " + v.getFileSize()));
	}
	public static void latest(String fileName) {
		if(!storage.containsKey(fileName)) {
			System.out.println("File Not Found");
			return ;
		}
		Version v=storage.get(fileName).getLast();
		System.out.println(fileName+" "+v.getVersionName()+" "+v.getFileSize());
		
		
	}
	public static void totalStorage(String fileName) {
		if(!storage.containsKey(fileName)) {
			System.out.println("File Not found");
			return;
		}
		int total=0;
		total=(int) storage.get(fileName).stream().mapToInt(Version::getFileSize).sum();
		System.out.println(fileName+" "+total);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0) {
			String inp=sc.nextLine();
			String[]input=inp.split("\\s+");
			if(input.length>=2) {
				String command=input[0];
				if(command.equalsIgnoreCase("upload")) {
					System.out.println("upload called");
					String fileName=input[1];
					Version v=new Version(input[2],Integer.parseInt(input[3]));
					upload(fileName,v);
				}
				if(command.equalsIgnoreCase("fetch")) {
					System.out.println("Fetch called");
					String fileName=input[1];
					fetch(fileName);
				}
				if(command.equalsIgnoreCase("latest")) {
					System.out.println("latest called");
					String fileName=input[1];
					fetch(fileName);
				}
				if(command.equalsIgnoreCase("total_storage")) {
					System.out.println("total_storage called");
					String fileName=input[1];
					totalStorage(fileName);
				}
			}
			
		}
//		System.out.println(storage);
	}
}

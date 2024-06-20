package day19;

import java.io.File;

public class Main1 {

	public static void main(String[] args) {

		File folder = new File("/Users/parahuang/Desktop/test");
		findPicture(folder);
//		System.out.println(folder.exists());
//		File[] fs = folder.listFiles();
//		for (File f : fs) {

//			if(f is a file){
//				if(f is a picture){
//					System.out.println(f.getName());	
//				}
//			}else {
//				=> f is a folder
//				open this folder,get all files inside of this folder
//				check very file in for loop , save file in a variable f
//				if(f is a file){
//					if(f is picture){System.out.println(f.getName());	}
//				}else{
//					f is a folder
//				}
//			}
//		}
	}

	public static void findPicture(File folder) {
		// 1.open this folder,get all files inside of this folder
		File[] fs = folder.listFiles();
		// 2.check very file in for loop , save file in a variable f
		for (File f : fs) {
			if (f.isFile()) {// f is a file
				String name = f.getName();
				String suffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
				if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg") || suffix.equals("gif"))// f is a picture
					System.out.println(folder.getName()+"--"+name);
			} else {
				//doing the code inside of this method again
				//calling this method again
				//algorithm - recursion
				findPicture(f);
			}
		}
	}

	// isFile isDirectory
	public static void findPicture2(File folder) {
		// 1.open this folder,get all files inside of this folder
		File[] fs = folder.listFiles();
		// 2.check very file in for loop , save file in a variable f
		for (File f : fs) {
			if (f.isFile()) {// f is a file
				String name = f.getName();
				String suffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
				if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg") || suffix.equals("gif"))// f is a picture
					System.out.println(name);

			} else {// f is a folder
					// xxxxxxxxxxxxxxxxxx--x
				File[] fs2 = f.listFiles();
				for (File f2 : fs2) {
					if (f2.isFile()) {
						String name = f2.getName();
						String suffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
						if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg")
								|| suffix.equals("gif"))// f is a picture
							System.out.println(name);
					} else {
						// xxxxxxxxxxxxxxxxxxx--y
						File[] fs3 = f2.listFiles();
						for (File f3 : fs2) {
							if (f3.isFile()) {
								String name = f3.getName();
								String suffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
								if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg")
										|| suffix.equals("gif"))// f is a picture
									System.out.println(name);
							} else {
								// xxxxxxxxxxxxxxxxxxx--z
								File[] fs4 = f3.listFiles();
								for (File f4 : fs2) {
									if (f3.isFile()) {
										String name = f4.getName();
										String suffix = name.substring(name.lastIndexOf(".") + 1).toLowerCase();
										if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg")
												|| suffix.equals("gif"))// f is a picture
											System.out.println(name);
									} else {

									}
								}
							}
						}
					}
				}

			}
		}
	}

}

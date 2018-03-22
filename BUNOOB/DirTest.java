import java.io.*;

public class DirTest {

	public static void main(String[] args) {
		// 获取目录
		// File directory = new File("");

		// try {
		// 	System.out.println(directory.getCanonicalPath());
		// 	System.out.println(directory.getAbsolutePath());
		// 	System.out.println(directory.getPath());
		// } catch(Exception e) {

		// }

		// 创建文件夹
		// File dir = new File("");
		// String dirname = dir.getAbsolutePath();
		// File d = new File(dirname + "/test");
		// d.mkdirs();

		// 读取目录
		// File d = new File("");
		// String dRoot = d.getAbsolutePath();

		// File f = new File(dRoot);
		// if(f.isDirectory()) {
		// 	System.out.println("目录" + dRoot);
		// 	String[] s = f.list();

		// 	for( int i = 0; i < s.length; i++) {
		// 		File f1 = new File(dRoot + "/" + s[i]);
		// 		if(f1.isDirectory()) {
		// 			System.out.println(s[i] + " 是一个目录");
		// 		} else {
		// 			System.out.println(s[i] + " 是一个文件");
		// 		}
		// 	}
		// } else {
		// 	System.out.println(dRoot + "不是一个目录");
		// }

		// 删除
		File d = new File("");
		String dRoot = d.getAbsolutePath();

		File f = new File(dRoot + "/test/");
		deleteFolder(f);
	}

	// 删除文件和目录
	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if(files != null) {
			for(File f : files) {
				if(f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
		folder.delete();
	}
}

package section02.run;

import section02.service.ByteService;

public class ByteRun {
	public static void main(String[] args) {
		
		ByteService service = new ByteService();
		
		//service.fileByteOutput(); // 파일 출력
		//service.bufferedFileByteOutput(); //파일 출력
		//service.fileByteInput(); // 파일 입력(한글 깨짐)
		//service.fileByteInput2(); // 파일 입력 (한글 안꺠짐)
		//service.fileByteInput2(); // 파일 입력 (한글 안꺠짐)
		//service.BufferedFileByteInput(); // 버퍼 파일 입력
		service.fileCopy();
		
	}
}

package git_test2;

public class Hello {
<<<<<<< HEAD
	String message = "안녕하세요";
	
=======
	String message;

	public Hello() {
		this("안녕하세요");
	}

	public Hello(String message) {
		this.message = message;
	}

>>>>>>> 1eb8688cacf673a3ce62f05f31fbc4a786edba33
	public String say() {
		return message;
	}

}

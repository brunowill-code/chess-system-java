package boardgame;

import java.util.concurrent.ExecutionException;

public class BoardException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}
	
}

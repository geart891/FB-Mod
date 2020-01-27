package net.filebot;

public interface ExitCode {

	public static final int SUCCESS = 0;

	public static final int ERROR = 1;

	public static final int BAD_LICENSE = 2;

	public static final int FAILURE = 3;

	public static final int DIE = 4;

	public static final int NOOP = 100;
  
	static String getErrorMessage(int code) {
		switch (code) {
			case 0:
				return "Done";
			case 1:
				return "Error";
			case 2:
				return "Bad License";
			case 3:
				return "Failure";
			case 4:
				return "Abort";
			case 100:
				return "Done";
		} 
		return String.format("Error (%d)", new Object[] { Integer.valueOf(code) });
	  	}
	  
		static String getErrorKaomoji(int code) {
			switch (code) {
				case 0:
					return "ヾ(＠⌒ー⌒＠)ノ";
				case 1:
					return "(o_O)";
				case 2:
					return "(>_<)";
				case 3:
					return "(×_×)⌒☆";
				case 4:
					return "(×_×)";
				case 100:
					return "¯\\_(ツ)_/¯";
			} 
			return "/╲/\\╭[☉﹏☉]╮/\\╱\\";
		}
	}
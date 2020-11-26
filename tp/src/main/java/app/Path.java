package app;

import lombok.Getter;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {
        @Getter public static final String INDEX = "/inicio";
		@Getter public static final String LOGIN = "/login";
        @Getter public static final String LOGOUT = "/logout";
        @Getter public static final String BOOKS = "/books";
        @Getter public static final String ONE_BOOK = "/books/:isbn";
        
        public static String getINDEX() {
			return INDEX;
		}
		public static String getLOGIN() {
			return LOGIN;
		}
		public static String getLOGOUT() {
			return LOGOUT;
		}
		public static String getBOOKS() {
			return BOOKS;
		}
		public static String getONE_BOOK() {
			return ONE_BOOK;
		}
    }

    //ruta de los templates en la carpeta src/main/resources
    public static class Template {
        public final static String INDEX = "/velocity/pages/inicio.vm";
        public final static String LOGIN = "/velocity/pages/login.vm";
        public final static String BOOKS_ALL = "/velocity/book/all.vm";
        public static final String BOOKS_ONE = "/velocity/book/one.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
    }

}

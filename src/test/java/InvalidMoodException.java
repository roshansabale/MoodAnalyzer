public class InvalidMoodException extends Exception {

        enum ExceptionType {
            NullMood,EmptyMood,InvalidMood;
        }
        public ExceptionType getType() {
            return this.type;
        }
        public ExceptionType type;

        public InvalidMoodException(ExceptionType type, String message) {
            super(message);
            this.type=type;
        }
}

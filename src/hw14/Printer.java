package hw14;

public interface Printer {
    void print(MessagePrinter.Message message);
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();
        MessagePrinter.Message message1 = new MessagePrinter.Message("Hello bro!", "Stranger");
        MessagePrinter.Message message2 = new MessagePrinter.Message("Let's go partying", null);
        MessagePrinter.Message message3 = new MessagePrinter.Message(null, null);
        MessagePrinter.Message message4 = new MessagePrinter.Message("", "Unlucky");
        printer.print(message1);
        printer.print(message2);
        printer.print(message3);
        printer.print(message4);
    }
}

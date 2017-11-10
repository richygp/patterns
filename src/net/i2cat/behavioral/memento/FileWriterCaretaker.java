package net.i2cat.behavioral.memento;

public class FileWriterCaretaker {

    private Object object;

    public void save(FileWriterUtil fileWriterUtil) {
        this.object = fileWriterUtil.save();
    }

    public void undo(FileWriterUtil fileWriterUtil) {
        fileWriterUtil.undoToLastSave(object);
    }
}

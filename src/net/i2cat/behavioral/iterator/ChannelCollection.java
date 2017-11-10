package net.i2cat.behavioral.iterator;

public interface ChannelCollection {

    void addChannel(Channel channel);
    void removeChannel(Channel channel);
    ChannelIterator iterator(ChannelTypeEnum type);

}

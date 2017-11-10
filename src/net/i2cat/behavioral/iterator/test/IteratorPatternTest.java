package net.i2cat.behavioral.iterator.test;

import net.i2cat.behavioral.iterator.*;

public class IteratorPatternTest {
    public static void main(String[] args) {
        ChannelCollection channelCollection = populateChannels();
        ChannelIterator channelIterator = channelCollection.iterator(ChannelTypeEnum.ALL);
        while(channelIterator.hasNext()) {
            Channel c = channelIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("*********");
        ChannelIterator channelHindiIterator = channelCollection.iterator(ChannelTypeEnum.HINDI);
        while(channelHindiIterator.hasNext()) {
            Channel c = channelHindiIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
        channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
        channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
        channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
        return channels;
    }
}

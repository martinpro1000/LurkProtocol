package com.martin.lurkprotocol;

import io.netty.buffer.*;
import io.netty.channel.*;
import io.netty.util.*;

import java.nio.charset.*;
import java.util.*;

public class LurkClient extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        ByteBuf byteBuf = (ByteBuf) o;
        System.out.println(byteBuf.getByte(0));
        if(byteBuf.getByte(0) == 11) {
            System.out.println("true!");

            byteBuf.readerIndex(7);
            while(byteBuf.isReadable()) {
                System.out.print((char) byteBuf.readByte());
            }
        }
    }
}

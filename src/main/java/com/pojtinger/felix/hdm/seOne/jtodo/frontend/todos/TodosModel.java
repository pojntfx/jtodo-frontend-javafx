package com.pojtinger.felix.hdm.seOne.jtodo.frontend.todos;

import com.pojtinger.felix.hdm.seOne.jtodo.frontend.JTodoGrpc;
import com.pojtinger.felix.hdm.seOne.jtodo.frontend.JTodoGrpc.JTodoBlockingStub;

import io.grpc.ManagedChannelBuilder;

public class TodosModel {
    JTodoBlockingStub blockingStub;

    public void connect(String apiUrl) {
        var channel = ManagedChannelBuilder.forTarget(apiUrl).usePlaintext().build();

        this.blockingStub = JTodoGrpc.newBlockingStub(channel);
    }
}
package com.learn;

import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;

import static java.util.Objects.isNull;

public abstract class ResourcePool<T> {

    private final ConcurrentLinkedQueue<T> pool;

    public ResourcePool(int size) {
        pool = new ConcurrentLinkedQueue<>();
        init(size);
    }

    private void init(int size) {
        for(int i = 0; i < size; i++)
            pool.add(create());
    }

    public T borrow() {
        Optional<T> ob = Optional.ofNullable(pool.poll());
        return ob.orElseThrow(() -> new RuntimeException("Empty resource pool"));
    }

    public void returnRes(T res) {
        if(isNull(res)) {
            throw new RuntimeException("Invalid resource to submit");
        }
        pool.offer(res);
    }

    public int size() {
        return pool.size();
    }

    public abstract T create();
}

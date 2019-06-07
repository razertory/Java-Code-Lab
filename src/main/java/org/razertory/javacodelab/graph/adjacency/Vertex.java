package org.razertory.javacodelab.graph.adjacency;

import java.math.BigInteger;

/*
 * 邻接表的节点
 * 其中的 label 表示节点的实际内容，为了满足节点的唯一性和能够作为 key 存入 hashmap，重写掉 equals 和 hashcode
 */
public class Vertex {
    private int val;

    Vertex(int val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        return val;
    }

    @Override
    public boolean equals(Object vertex) {
        return vertex != null && this.hashCode() == vertex.hashCode();
    }
}

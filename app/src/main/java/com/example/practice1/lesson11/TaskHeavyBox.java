package com.example.practice1.lesson11;

import java.util.ArrayDeque;

public class TaskHeavyBox {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(new HeavyBox());
        heavyBoxes.offer(new HeavyBox());
        heavyBoxes.offer(new HeavyBox());
        heavyBoxes.offer(new HeavyBox());
        heavyBoxes.offer(new HeavyBox());

        while (heavyBoxes.peek() != null) {
            heavyBoxes.poll();
        }
    }
}
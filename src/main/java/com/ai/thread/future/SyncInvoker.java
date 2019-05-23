package com.ai.thread.future;

public class SyncInvoker {
    public static void main(String[] args) throws InterruptedException {
        /*String result = get();
        System.out.println(result);*/

        FutureService futureService = new FutureService();
        Future<String> future = futureService.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world";
        },System.out::println);
        System.out.println("hello,,,,,,,,");
        System.out.println("---------------");
        Thread.sleep(1000);
        System.out.println(future.get());

    }
    private static String get() throws InterruptedException {
        Thread.sleep(10000L);
        return "FINISH";
    }
}

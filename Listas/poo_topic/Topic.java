package Listas.poo_topic;

public class Topic {
    private List<Pass> prioritySeats;
    private List<Pass> normalSeats;
    public Topic(int capacity, int qtdPriority) {
    }

    private static int findFirstFreePos(List<Pass> list) {
    }
    
    private static int findByName(String name, List<Pass> list) {
    }
    
    private static boolean insertOnList(Pass pass, List<Pass> list) {
    }

    private static boolean removeFromList(String name, List<Pass> list) {
    }


    public boolean insert(Pass pass) {
    }

    public boolean remove(String name) {
    }
    public String toString() {
        return "[" + Stream.concat(
            this.prioritySeats.stream().map(p -> ("@" + ((p == null)?(""):("" + p)))), 
            this.normalSeats.stream().map(p -> ("=" + ((p == null)?(""):("" + p)))))
            .collect(Collectors.joining(" ")) + "]";
    }
}

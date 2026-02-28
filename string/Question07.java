import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Question07 {

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

    static class Element implements Comparable<Element> {
        char ch;
        int freq;

        Element(char ch, int freq){
            this.ch = ch;
            this.freq = freq;
        }

        public int compareTo(Element other){
            return other.freq - this.freq;
        }
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : s.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Element> pq = new PriorityQueue<>();

        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            pq.offer(new Element(entry.getKey(), entry.getValue()));
        }

        StringBuilder str = new StringBuilder();

        while(!pq.isEmpty()){
            Element element = pq.poll();
            while(element.freq > 0){
                str.append(element.ch);
                element.freq--;
            }
        }

        return str.toString();
    }
}
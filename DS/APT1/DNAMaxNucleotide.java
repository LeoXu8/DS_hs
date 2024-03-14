public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
        int most = 0;
        String running = "";
        for (String s : strands){
            int count = 0;
            for (int i = 0; i < s.length(); i ++){
                if (s.substring(i, i+1).equals(nuc)){
                    count ++;
                }
            }
            if (count == most && count != 0){
                if (s.length() > running.length()){
                    running = s;
                }
            }
            if (count > most){
                running = s;
                most = count;
            }
        }
        return running;
      }
   }
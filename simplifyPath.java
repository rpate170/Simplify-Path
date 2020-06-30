class Solution {
    public String simplifyPath(String path) {
        if (path.length() == 0) {
            return "";
        }
        String[] str = path.split("/", 0);
        Deque<String> dq = new LinkedList<String>();
        for (String s : str) {
            if (!(s.equals(""))) {
                if (s.equals(".")) {}
                else if(s.equals("..")){
                    if (!(dq.isEmpty())){
                        dq.removeLast();
                    }
                }
                else {
                    dq.add(s);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        
        if (dq.isEmpty()) {
            sb.append('/');
        }
        while (!(dq.isEmpty())) {
            sb.append('/');
            sb.append(dq.pop());
        }
        return sb.toString();
    }
}
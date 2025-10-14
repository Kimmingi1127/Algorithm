function solution(s){
    s = s.toLowerCase();
    var p = 0;
    var y = 0;
    
    for (var i = 0; i < s.length; i++) {
        if(s[i] == 'p') {
            p++;
        } else if(s[i] == 'y') {
            y++;
        }
    }

    return p == y;
}
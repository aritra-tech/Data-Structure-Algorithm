class RecentCounter {
public:
    queue <int> qu;


    int ping(int t) {
        qu.push(t); //insert ping time in queue
        while(qu.front() < t-3000) qu.pop(); //remove all pings before 3000ms of current time
        return qu.size();
    }
};

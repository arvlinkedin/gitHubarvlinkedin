const { filter } = require("rxjs");


function findMostFrequentUser(){
    let input = ["user1 2025-11-12T09:00",
    "user3 2025-11-12T09:02",
    "user1 2025-11-12T09:03",
    "user3 2025-11-12T09:04",
    "user3 2025-11-12T09:05",
    "user1 2025-11-12T09:06",
    "user2 2025-11-12T09:07",];

    
    let userCount = {};
    let inputs = [];
    let userMap = new Map();
    let maxCount = 0;
    for(let i = 0; i < input.length; i++){
        let log = input[i].split(" ");        
        inputs.push({user : log[0], date: log[1]});
        let uName = log[0];
        let count = userMap.has(uName) ? userMap.get(uName) + 1 : 1
        userMap.set(uName, count);
        if(count > maxCount){
            maxCount = count;
        }
    }
         
    console.log(Array.from(userMap).filter(([k,v]) => v === maxCount).reverse()[0].sort((a,b) => b - a));
}   

findMostFrequentUser();
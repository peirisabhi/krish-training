const readline = require("readline").createInterface({
    input:process.stdin,
    output:process.stdout
})


readline.question("Enter two words (Example :- night,thing)  ", val => {

    let words = val.split(",");

    if(words[0].length !== words[1].length){
        console.log("No Anagrams founded, because word's size is not same.")
    }else{

        let isAnagrams = true;

        Array.from(words[0]).every(wordOneCharacter => {
            let characterFound = false;

            Array.from(words[1]).every(wordTwoCharacter => {
                if(wordTwoCharacter === wordOneCharacter){
                    characterFound = true;
                    return false;
                }
                return true;
            })

            if(!characterFound){
                isAnagrams = false;
                return false
            }
            return true
        })

        if(isAnagrams)
            console.log("Anagrams founded")
        else
            console.log("No Anagrams founded")
    }

    readline.close()
})

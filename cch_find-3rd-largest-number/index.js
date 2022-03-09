const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
})

readline.question("Enter numbers (Example:- 1,3,4,5,9) ", val => {
    let numbers = val.split(",").map(function (number){
        return parseInt(number)
    })

    // console.log(numbers)

    if (numbers.length < 3) {
        console.log("Invalid number pattern, at least have 3 numbers")
    } else {

        for (let fl = 0; fl < numbers.length - 1; fl++) {
            for (let sl = 0; sl < numbers.length - 1; sl++) {
                if (numbers[sl] > numbers[sl + 1]) {
                    let tempVal = numbers[sl]
                    numbers[sl] = numbers[sl + 1]
                    numbers[sl + 1] = tempVal
                }
            }
        }

        // console.log(numbers)
        console.log("3rd largest number is " + numbers[numbers.length - 3])

    }
    readline.close()

})

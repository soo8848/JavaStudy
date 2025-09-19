document.querySelector("a").addEventListener("click", function(e) {
    e.preventDefault();

    const num1 = document.querySelector(".start").value;
    const num2 = document.querySelector(".end").value;

    

    let message = "<div>";
    for (let j = 1; j <= 9; j++) {   
        message += "<div>";
        for (let i = num1; i <= num2; i++) {   
            message += "<span>" 
                     + i + " * " + j + " = " + (i * j) 
                     + "</span>";
        }
        message += "</div>";
    }
    message += "</div>";

    document.write(message);
});

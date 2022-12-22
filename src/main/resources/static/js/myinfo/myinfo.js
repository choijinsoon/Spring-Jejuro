window.addEventListener("load", function() {
    const deleteBtn = document.querySelector(".delete");
    const updateBtn = document.querySelector(".update");

    deleteBtn.onclick = function (e){
        e.preventDefault();

        if(confirm("탈퇴 하시겠습니까?"))
            location.href="/html/index.html"
    }

    updateBtn.onclick = function (e){
        e.preventDefault();

        location.href="/html/myinfo/update.html"
    }

});

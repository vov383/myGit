const $ = (selector) => document.querySelector(selector);

function App() {
    //form 태그가 자동으로 전송되는 것을 막아준다.
    $("#espresso-menu-form").addEventListener("submit", (e) => {
        e.preventDefault();
    });

    const addMenuName = () => {
        if($("#espresso-menu-name").value === ""){
            alert("값을 입력해주세요");
            return;
        }
        espressoMenuName();
        const espressoMenuName = $("#espresso-menu-name").value;
        const menuItemTemplate = (espressoMenuName) => {
            return `
                <li className="menu-list-item d-flex items-center py-2">
                    < span
                        className = "w-100 pl-2 menu-name sold-out" >${name} < /span>
                    <button
                        type="button"
                        className="bg-gray-50 text-gray-500 text-sm mr-1 menu-sold-out-button"
                    >
                        수정
                    </button>
                    <button
                        type="button"
                        class="bg-gray-50 text-gray-500 text-sm menu-remove-button"
                    >
                        삭제
                    </button>
                </li>`;
        };
        console.log(menuItemTemplate());
        $("#espresso-menu-list").insertAdjacentHTML(
            "beforeend",
            menuItemTemplate(espressoMenuName)
        );
        //const 변수 = li 개수를 카운팅해서
        const menuCount = $("#espresso-menu-list").querySelectorAll("li").length;
        $(".menu-count").innerText = `총 ${menuCount}개`
    };

    $("#espresso-menu-submit-button").addEventListener("click", () => {
        addMenuName();
    });


    //메뉴의 이름을 입력받는 건
    $("#espresso-menu-name").addEventListener("keypress", (e) => {
        if(e.key !== "Enter"){
            return;
        }
        addMenuName();
    });
}

App();
function openTjPopup(type) {
    const bg = document.getElementById('tj-popup-bg');
    const windowBox = document.getElementById('tj-popup-window');
    const contents = document.querySelectorAll('.tj-popup-content');

    // 1. 모든 팝업 내용 숨기기
    contents.forEach(item => {
        item.style.display = 'none';
    });

    // 2. 배경 보이기 & 팝업 애니메이션 클래스 추가
    bg.style.display = 'block';
    windowBox.classList.add('tj-show');

    // 3. 클릭한 특정 정보만 보이기
    document.getElementById(type).style.display = 'block';
}

function closeTjPopup() {
    const bg = document.getElementById('tj-popup-bg');
    const windowBox = document.getElementById('tj-popup-window');

    // 배경 숨기기 & 팝업 클래스 제거
    bg.style.display = 'none';
    windowBox.classList.remove('tj-show');
}
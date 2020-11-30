window.onload = function() {
     
    function onClick() {
        document.querySelector('.modal_container').style.display ='block';
        document.querySelector('.modal_background').style.display ='block';
    }   
    function offClick() {
        document.querySelector('.modal_container').style.display ='none';
        document.querySelector('.modal_background').style.display ='none';
    }
 
    document.getElementById('modal_btn').addEventListener('click', onClick);
    document.querySelector('.modal_close').addEventListener('click', offClick);
}
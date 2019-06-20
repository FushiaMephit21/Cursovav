document.querySelectorAll('input').forEach(function(elem){
	if (elem.value!='') {
		elem.disabled = 1;
	}
});

document.querySelector('button.BluBtn').parentNode.style.padding = 1.5 + '%';
document.querySelector('button.RedBtn').parentNode.style.padding = 1.5 + '%';
document.querySelectorAll('button.RedBtn').forEach(function(e){
	e.parentNode.style.backgroundColor = '#fd8080';
});

document.querySelectorAll('button.BluBtn').forEach(function(e){
	e.parentNode.style.backgroundColor = '#3be4ff';
});

document.querySelectorAll('button').forEach(function(e){
	if (e.innerText=='Add'){
		e.parentNode.style.backgroundColor = '#007bff';
	}
	e.style.color = 'white';
	e.parentNode.style.borderTop = '1px solid black';
	e.parentNode.style.borderBottom = '1px solid black';
	e.parentNode.style.borderRight = '1px solid black';
	e.parentNode.style.cursor = 'pointer';
	e.style.cursor = 'pointer';
});

let reg =  window.location.href.match(/[a-zA-Z]+List/);
reg = String(reg);
let reg2 = reg.match(/.*[^(List)]/);
reg2 = String(reg2);
document.querySelector('.titleh1').innerText = 'Table: ' + reg2;
delete reg;




let tm = document.querySelector('.table_menu');
tm.style.position = 'absolute';
tm.style.width = '30vw';
tm.style.height = '100vh';
tm.style.background = 'white';

let mbtn = document.querySelector('.button_menu');
mbtn.style.position = 'fixed';
mbtn.style.width = '6vw';
mbtn.style.height = '6vh';
mbtn.style.marginLeft = '30vw';
tm.style.transition = '1s';
tm.style.overflow = 'scroll';
tm.style.left = '-30vw';

mbtn.onclick = function(e) {
	if (tm.style.left=='0vw') {
		tm.style.left='-30vw';
		mbtn.innerText='=';
	} else if (tm.style.left=='-30vw') {
		tm.style.left='0vw';
		mbtn.innerText='x';
	}
}


let dataTM = "<ul class='c_ul'><a href='./corpusList'><li>Corpus</li></a><a href='./departmentList'><li>Department</li></a><a href='.dogtorsList'><li>Dogtors</li></a><a href='./hinegologsList'><li>Hinegologs</li></a><a href='./hospitalsList'><li>Hospitals</li></a><a href='./labaratoryList'><li>Labaratory</li></a><a href='./medicalinstitutionsList'><li>Medical Institutions</li></a><a href='./naukzvannyaList'><li>Naukzvannya</li></a><a href='./nevropatologsList'><li>Nevropatologs</li></a><a href='./ottolaringologsList'><li>Ottolaringologs</li></a><a href='./patientsList'><li>Patients</li></a><a href='./polikliniksList'><li>Polikliniks</li></a><a href='./postsList'><li>Posts</li></a><a href='./profileslabaratoryList'><li>Profiles Labaratory</li></a><a href='./rentgenologsList'><li>Rentgenologs</li></a><a href='./staffsList'><li>Staffs</li></a><a href='./stomatologsList'><li>Stomatologs</li></a><a href='./surgeonsList'><li>Surgeons</li></a><a href='./terapevtsList'><li>Terapevts</li></a></ul>";

tm.insertAdjacentHTML('beforeEnd',dataTM);
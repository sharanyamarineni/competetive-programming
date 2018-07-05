If we execute this Javascript, what will the browsers console show?

  var text = 'outside';
function logIt(){
    console.log(text);
    var text = 'inside';
};
logIt();

//Answer: undefined, text was a global variable intially but when the interpreter executes,it calls the logIt() method the variable text is 
//declared without assignment as local variable because of its declaration in the method. But the assignment of value to the variable is done 
//by "text='inside'" statement.So before this statement in this method the text variable is Undefined

//It is interpreted as

var text = 'outside';
function logIt(){
    var text;
    console.log(text);
    text = 'inside';
};
logIt();
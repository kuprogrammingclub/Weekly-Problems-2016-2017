function Pos(radius, angle) {
    this.x = radius*Math.cos(angle);
    this.y = radius*Math.sin(angle);
}

// Set up!
var canvas = document.getElementById("a");
var context = canvas.getContext("2d");
context.translate(canvas.width/2,canvas.height/2);
context.transform(1,0,0,-1,0,0);
var radius;
var numVertices;

function doSubmit(){
    context.clearRect(-canvas.width/2, -canvas.height/2, canvas.width, canvas.height);
    radius = document.getElementById("radiusTxt").value;
    numVertices = document.getElementById("verticesTxt").value;
    var i = 0;
    var outerVertices = [];
    var innerVertices = [];
    var angle = Math.PI*2/numVertices;
    var innerRadius = radius*Math.sin(Math.PI/2-2*angle/2)/Math.sin(Math.PI/2+angle/2);
    
    var outerAngle;
    for (i = 0; i < numVertices; i++) {
        outerAngle = Math.PI/2 - i*angle;
        outerVertices.push(new Pos(radius, outerAngle));
        innerVertices.push(new Pos(innerRadius, outerAngle + angle/2));
    }

    var point1;
    var point2;
    var point3;
    for (var i = 0; i < numVertices; i++) {
        point1 = innerVertices[i];
        point2 = innerVertices[(i+1)%numVertices];
        point3 = outerVertices[i];
        // Draw the vertice triangle
        context.beginPath();
        context.moveTo(point1.x, point1.y);
        context.lineTo(point2.x, point2.y);
        context.lineTo(point3.x, point3.y);
        context.lineTo(point1.x, point1.y);
        context.stroke();
    }
}

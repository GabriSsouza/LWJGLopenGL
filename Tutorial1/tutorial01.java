import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;
 
 
 
class Tutorial01{
 
     public Tutorial01() {
   	 
	if (!GLFW.glfwInit()) {
  	 
    	System.exit(1);
	}
    
	long win = glfwCreateWindow(640,420, "window", 0,0);
    
	glfwShowWindow(win);
    
	glfwMakeContextCurrent(win);
	GL.createCapabilities();
   
    
	while(!glfwWindowShouldClose(win)){
    	glfwPollEvents();
    	glClear(GL_COLOR_BUFFER_BIT);
   	 
    	glBegin(GL_QUADS);
    	glColor4f(1, 0, 0,0);
    	glVertex2f( -0.5f, -0.5f );
    	glVertex2f(  0.5f, -0.5f );
    	glVertex2f(  0.5f,  0.5f );
    	glVertex2f( -0.5f,  0.5f );
    	glEnd();
   	 
    	glfwSwapBuffers(win);
   	 
	}
    
	GLFW.glfwTerminate();
}
 
    public static void main(String[] args) {
   	 
   	 new Tutorial01();
}
    }
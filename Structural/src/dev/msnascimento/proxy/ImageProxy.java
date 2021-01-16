package dev.msnascimento.proxy;

public class ImageProxy implements DisplayObject {

	String path;
	ImageFile imageFile;

	public ImageProxy(String path) {
		super();
		this.path = path;
	}

	@Override
	public void display() {
		if (imageFile == null) {
			imageFile = new ImageFile(path);
		}
		imageFile.display();
	}

}

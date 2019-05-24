package github.chorman0773.pokemonsms.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.List;

import github.chorman0773.pokemonsms.internal.SystemInterface;
import github.chorman0773.pokemonsms.net.server.NetControllerServer;
import github.chorman0773.pokemonsms.net.server.NetHandlerServer;
import github.chorman0773.pokemonsms.siding.EnumSide;

public class DedicatedServer implements SystemInterface {
	static {
		if(!EnumSide.isServer())
			throw new Error("Cannot Initialize DedicatedServer on a Client");
	}
	private static KeyPair keys;
	private static NetControllerServer controller;
	private static DedicatedServer instance;
	public static DedicatedServer getInstance() {
		return instance;
	}
	private Path root;
	public DedicatedServer(Path root) {
		this.root = root;
	}

	@Override
	public Path getRootDir() {
		// TODO Auto-generated method stub
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

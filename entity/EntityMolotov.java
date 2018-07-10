package mini.fallout.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityMolotov extends EntityThrowable
{


	public EntityMolotov(World worldIn) 
	{
		super(worldIn);
	}
	

	@Override
	protected void onImpact(RayTraceResult result) 
	{
		System.out.println("Boom!");
	}
	
	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		super.entityInit();
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		super.readEntityFromNBT(compound);
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound compound) {
		// TODO Auto-generated method stub
		super.writeEntityToNBT(compound);
	}

}

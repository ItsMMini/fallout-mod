package mini.fallout.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityBullet extends Entity implements IProjectile
{
	public EntityLivingBase shooter;
	
	private int ticksAlive = 100;

	public EntityBullet(World worldIn) 
	{
		super(worldIn);
	}
	
	public EntityBullet(World worldIn, EntityLivingBase shooter, float size)
    {
        super(worldIn);
        this.shooter = shooter;
        this.setSize(size, size);
        this.setAim();
    }
	
	public void setAim()
    {
		this.setLocationAndAngles(shooter.posX, shooter.posY, shooter.posZ, shooter.rotationYaw, shooter.rotationPitch);
		this.setPosition(this.posX, this.posY, this.posZ);
		this.motionX = 0.0D;
		this.motionY = 0.0D;
		this.motionZ = 0.0D;
		double accelX = 10 + this.rand.nextGaussian() * 0.4D;
		double accelY = 10 + this.rand.nextGaussian() * 0.4D;
		double accelZ = 10 + this.rand.nextGaussian() * 0.4D;
		double d0 = (double)MathHelper.sqrt(accelX * accelX + accelY * accelY + accelZ * accelZ);
        this.motionX = accelX / d0 * 0.1D;
        this.motionY = accelY / d0 * 0.1D;
        this.motionZ = accelZ / d0 * 0.1D;
    }
	
	@Override
	public void onUpdate() 
	{
		super.onUpdate();
		
		this.posX += this.motionX;
		this.posY += this.motionY;
		this.posZ += this.motionZ;
		
		ticksAlive--;
		if(ticksAlive <= 0) this.setDead();
		super.onUpdate();
	}


	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) 
	{

	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound compound)
	{

	}



	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoot(double x, double y, double z, float velocity, float inaccuracy) {
		// TODO Auto-generated method stub
		
	}

}
